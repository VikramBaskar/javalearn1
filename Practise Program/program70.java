abstract  class space{
     abstract void astonoid();
     abstract void  piolet();
     final void spaceship(){
        System.out.println("Ridding in spaceship!........");
     }
}

class galaxey extends space{
  public  void astonoid(){
        System.err.println("I'm a astonoid!-------");
    }
    public void piolet(){
        System.out.println("I'm a piolet!......");
    }

    @Override
    public  void finalize() throws Throwable {
        
        System.out.println("Execute the finalize()");
    }
    
}
class program70 extends galaxey{
    public static void main(String[] args) {
        galaxey gl = new galaxey();
        gl.astonoid();
        gl.piolet();
        gl.spaceship();
        gl =null;
        System.gc();
    }
}

