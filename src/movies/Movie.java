package movies;

import movies.MoviesArray;

public class Movie {

        private String name;
        private String category;



    public String getter() {
        return MoviesArray.Movies.name;
        return MoviesArray.Movies.category;
    }
    public void setter(String that, String thiss) {
        this.MoviesArray.name = that;
        this.MoviesArray.category = thiss;

    }
//    public String getCat() {
//        return MoviesArray.category;
//    }
//    public void setCat(String that) {
//        this.MoviesArray.category = that;
//    }

}
