package com.news.News.Controller;


import com.news.News.Models.Card;
import com.news.News.Models.Movie;
import com.news.News.Models.Post;
import com.news.News.Repo.CardRepo;
import com.news.News.Repo.MovieRepo;
import com.news.News.Repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class PostController {

    @Autowired
    PostRepo postRepo;
    @Autowired
    MovieRepo movieRepo;

    @Autowired
    CardRepo cardRepo;


    @RequestMapping(value="/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }



    @GetMapping(value="/get-All-News")
    public List<Post> get_All_News()
    {
        return postRepo.findAll();
    }
    @GetMapping(value="/get-All-Movies")
    public List<Movie> get_All_Movies()
    {
        return movieRepo.findAll();
    }

    @GetMapping(value = "/search/{text}")
    public List<Post> search(@PathVariable String text)
    {
        return postRepo.getPostsByTitleRegEx(text);
    }

    @PostMapping(value = "/add-new")
    public Post addPost(@RequestBody Post post)
    {
        return postRepo.save(post);
    }


    @PostMapping(value = "/add-new-data")
    public Movie addPostMovies(@RequestBody Movie movie)
    {
        return movieRepo.save(movie);
    }


    //Controller for Card

    @PostMapping("/addCard")
    public String saveCard(@RequestBody Card card)
    {
        List<Card> ans = cardRepo.findAll();
        card.setId(ans.size());
        cardRepo.save(card);
        return "Added card with id: "+card.getId();
    }

    @GetMapping("/findAll")
    public List<Card> getCards()
    {
        return cardRepo.findAll();
    }


    @DeleteMapping("/delete/{id}")
    public String cardDelete(@PathVariable Integer id)
    {
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        System.out.println(id);
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        cardRepo.deleteById(id);
        return "Deleted card with id: "+ id;
    }

    @PutMapping("/update/{id}")
    public Card updateCard(@RequestBody Card card)
    {
        //Optional<Card> old = cardRepo.findById(card.getId());
        cardRepo.save(card);
        return card;
    }


























}
