package java_2022.ch8;

public class OracleDao implements DataAccessObject{
    @Override
    public void select(){
        System.out.println("Searching in Oracle DB");
    }
    @Override
    public void insert(){
        System.out.println("Insert in Oracle DB");
    }
    @Override
    public void update(){
        System.out.println("Updating Oracle DB");
    }
    @Override
    public void delete(){
        System.out.println("Delete in Oracle DB");
    }
}
