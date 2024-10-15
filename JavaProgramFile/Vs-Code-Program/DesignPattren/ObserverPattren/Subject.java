interface Subject{
    void subscribe(Observer ob);
    void unsubscribe(Observer ob);
    void newVedioUploaded(String title);

}