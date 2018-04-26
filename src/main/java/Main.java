import entity.Book;
import entity.Car;
import entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("xxx");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();
//        manager.persist(new User("Jane"));
//        manager.persist(new User("Kate"));
//        manager.persist(new User("Jake"));
//        User user1 = manager.find(User.class, 1);
//        System.out.println(user1);
//
//        user1.setName("Harry");
//
//        TypedQuery<User> query = manager.createQuery("select u from User u where u.id > 2", User.class);
//
//        List<User> list = query.getResultList();
//        list.forEach(System.out::println);


//        Car car = new Car("subaru", new User("Gwen"));
//        manager.persist(car);
//        manager.remove(manager.find(Car.class, 4));

//        List<Car> cars = new ArrayList<>();
//        cars.add(new Car("subaru"));
//        cars.add(new Car("porsche"));
//        User user = new User("Gwen", cars);
//        manager.persist(user);

        User user = new User("Luke");
        List<Book> books = new ArrayList<>();
        books.add(new Book("Bible"));
        user.setBooks(books);
        manager.persist(user);

        manager.getTransaction().commit();


        manager.close();
        factory.close();

    }
}
