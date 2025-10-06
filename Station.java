public class Station {
    protected String name ;
    protected String line ;
    protected Station next ;
    protected Station previous ;
    protected boolean isAvailable ;

    // Two stations are equal when their line number and name are the same.

    public Station(String color, String name) {
        this.line = color ;
        this.name = name ;
    }
    
    public Station(String name, String line, Station n, Station p) {
        this.name = name ;
        this.line = line ;
        this.next = n ;
        this.previous = p ;
    }

    public void addNext(Station s) {

    }

    public void addPrev(Station s) {

    }

    public boolean isAvailable() {

        return false ;
    }

    public String toString(Station s) {

        return "" ;
    }

}
