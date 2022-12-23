package java_2022.ch8;

public class MySqlDao implements DataAccessObject{
    @Override
    public void select() {
        System.out.println("Searching in MySql DB");
    }

    @Override
    public void insert() {
        System.out.println("Insert in MySql DB");
    }

    @Override
    public void update() {
        System.out.println("Updating MySql DB");
    }

    @Override
    public void delete() {
        System.out.println("Delete in MySql DB");
    }
}

