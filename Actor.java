 class Actor{
 static void acting(){
        System.out.println("Actor is Acting");
    }
        public static void main(String[] args) {
            Actor a1 = new Actor();
            Actor a2 =null;
            System.out.println(a1);
            System.out.println(a2);
            a1.acting();
            a2.acting();

        }
    }
