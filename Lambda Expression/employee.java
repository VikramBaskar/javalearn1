class employee implements nonstaticmethod, nonstaticmethod1{
public static void main(String[] args) {
    nonstaticmethod em = new employee();
    em.calculate(120, 340);
    nonstaticmethod.test6();


}
@Override
public void calculate(int a,int b){
    nonstaticmethod.super.calculate(34, 45);
    nonstaticmethod1.super.calculate(12, 23);
}
} 