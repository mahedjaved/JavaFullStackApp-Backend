package dev.mahed.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/*
* This interface extents MongoRepo, it is used to pull data from a MongoDB
* */
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId>
{

}
