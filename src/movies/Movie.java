package movies;

public class Movie {

        String name;
        String category;

    public Movie() {
        name = "movie";
    }
    Movie(String name, String cat){
        this.name = name;
        this.category = cat;
    }

    String getName() {
        return this.name;
    }

     String getCat() {
        return this.category;
    }

     void setter(String that, String thiss) {
//         this.name = that;
//         this.category = thiss;
         name = that;
         category = thiss;

    }

//    void meth() {
//        new Movie("dog", "cats");
//    }
//    public String getCat() {
//        return MoviesArray.category;
//    }
//    public void setCat(String that) {
//        this.MoviesArray.category = that;
//    }

}
