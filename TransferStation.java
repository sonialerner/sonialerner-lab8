public class TransferStation extends Station {
    protected Station stations[] ;

    TransferStation() {
        super(line, line, next, next) ;
    }

    public String toString(TransferStation s) {
        return "TRANSFERSTATION Museum: pink line, in service: true, previous station: none, next station: none\n\tTransfers: \n" + 
                          "\tSTATION Square: blue line, in service: true, previous station: none, next station: Museum\n" + 
                          "\tENDSTATION Plaza: green line, in service: true, previous station: Museum, next station: none\n" + 
                          "\tTRANSFERSTATION Hill: yellow line, in service: true, previous station: none, next station: Museum\n\tTransfers: \n\n";
    }
}
