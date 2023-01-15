class Main {
    public static void main(String[] args){
      Newsfeed nf = new Newsfeed();
      nf.addMessagePost(new MessagePost("Yu Xiang", "hello"));
      nf.addPhotoPost(new PhotoPost("Yu Xiang", "cutecat.png", "this is a cute cat"));
      nf.show();
    }
  }