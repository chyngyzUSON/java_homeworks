import entity.*;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        User user1 = User.builder().login("user1").password("12345678").biography("java dev").build();
        User user2 = User.builder().login("user2").password("12345678").biography("python dev").build();
        User user3 = User.builder().login("user3").password("12345678").biography("c# dev").build();
        User user4 = User.builder().login("admin").password("admin").biography("im admin").build();
        User user5 = User.builder().login("pro_gamer").password("asdfg").biography("Im pro gamer").build();
        saveOrUpdate(user1);
        saveOrUpdate(user2);
        saveOrUpdate(user3);
        saveOrUpdate(user4);
        saveOrUpdate(user5);

        Post post1 = Post.builder().text("работаю в офисе").user(user1).createDate(new Date(2019-10-16)).build();
        Post post2 = Post.builder().text("Вышел в отпуск").user(user1).createDate(new Date(2019-10-14)).build();
        Post post3 = Post.builder().text("Я на ИК").user(user3).createDate(new Date(2019-10-12)).build();
        Post post4 = Post.builder().text("Купил новую машину, зацените").createDate(new Date(2019-04-01)).user(user3).build();
        Post post5 = Post.builder().text("играю в теннис").user(user2).createDate(new Date(2019-10-01)).build();
        Post post6 = Post.builder().text("Приболел").user(user2).createDate(new Date(2019-10-24)).build();
        Post post7 = Post.builder().text("Буду тех работы 15.04.2021 19:00").user(user4).createDate(new Date(2019-10-13)).build();
        Post post8 = Post.builder().text("Тех работы завершены").user(user4).createDate(new Date(2019-10-01)).build();
        Post post9 = Post.builder().text("Взял топ1").user(user5).createDate(new Date(2021-10-03)).build();
        Post post10 = Post.builder().text("Выйграл турнир").user(user5).createDate(new Date(2020-10-02)).build();
        saveOrUpdate(post1);
        saveOrUpdate(post2);
        saveOrUpdate(post3);
        saveOrUpdate(post4);
        saveOrUpdate(post5);
        saveOrUpdate(post6);
        saveOrUpdate(post7);
        saveOrUpdate(post8);
        saveOrUpdate(post9);
        saveOrUpdate(post10);

        Like like1 = Like.builder().user(user1).post(post5).comments(comment1).build();// вот здесь хотел лайкнуть своего же коммента юсер1, не через коллекцию не получился.
        Like like2 = Like.builder().user(user2).post(post5).build();
        Like like3 = Like.builder().user(user3).post(post2).build();
        Like like4 = Like.builder().user(user5).post(post1).build();
        Like like5 = Like.builder().user(user4).post(post9).build();
        //Like like6 = Like.builder().user(user1)..build();
        saveOrUpdate(like1);
        saveOrUpdate(like2);
        saveOrUpdate(like3);
        saveOrUpdate(like4);
        saveOrUpdate(like5);

        Comment comment1 = Comment.builder().user(user1).post(post5).text("Классная машина!").build();
        Comment comment2 = Comment.builder().user(user2).post(post5).text("Понравился розовый цвет машины :)").build();
        Comment comment3 = Comment.builder().user(user3).post(post2).text("Хорошо играешь!").build();
        saveOrUpdate(comment1);
        saveOrUpdate(comment2);
        saveOrUpdate(comment3);

        Follower follower1 = Follower.builder().userFollower(user1).userFollowed(user3).build();
        Follower follower2 = Follower.builder().userFollower(user3).userFollowed(user1).build();
        Follower follower3 = Follower.builder().userFollower(user3).userFollowed(user2).build();
        if (follower1.getUserFollower() != follower1.getUserFollowed()){
            saveOrUpdate(follower1);
        }
        if (follower2.getUserFollower() != follower2.getUserFollowed()){
            saveOrUpdate(follower2);
        }
        if (follower3.getUserFollower() != follower3.getUserFollowed()){
            saveOrUpdate(follower3);
        }

        user1.setBiography("senior java developer");
        saveOrUpdate(user1);

        //ManyToMany example
//        T_User t_user1 = T_User.builder().username("t_user1").build();
//        T_User t_user2 = T_User.builder().username("t_user2").build();
//        T_User t_user3 = T_User.builder().username("t_user3").build();
//        saveOrUpdate(t_user1);
//        saveOrUpdate(t_user2);
//        saveOrUpdate(t_user3);
//
//        T_Post t_post = new T_Post();
//        t_post.setText("T_Text");
//        t_post.setUser(t_user1);
//        List<T_User> likedUsers = Arrays.asList(t_user2, t_user3);
//        t_post.setLikedUsers(likedUsers);
//
//        saveOrUpdate(t_post);

    }

    public static <T> T saveOrUpdate(T entity) {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        hibernateSession.saveOrUpdate(entity);
        hibernateSession.getTransaction().commit();
        hibernateSession.close();
        System.out.println("Запись создана/обновлена успешно");
        return entity;
    }

}
