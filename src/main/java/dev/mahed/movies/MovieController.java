package dev.mahed.movies;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Very first REST API controller
@RestController
@RequestMapping("/api/v1/movies")
public class MovieController
{
    // a new get method
    @GetMapping
    public ResponseEntity<String> allMovies()
    {
        // OK status is 200, ALL REST APIs should return proper status code
        return new ResponseEntity<String>("All Movies !!", HttpStatus.OK);

        // in order to test above you canuse
    }
}
