public class EndStation extends Station {

    EndStation() {

    }

    public EndStation makeEnd(EndStation s) {

        return s ;
    }

    public String toString(EndStation s) {
        
        if(s.next == null)
            return "ENDSTATION " + s.name + ": " + s.line + ", in service: " + s.isInService  + ", previous station: " + s.previous + ", next station: none" ;

        return "ENDSTATION " + s.name + ": " + s.line + " line , in service: " + s.isInService  + ", previous station: " + s.previous + ", next station: " + s.next;
    }
}