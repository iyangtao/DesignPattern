package live.yangtao.srp.user.service;

import live.yangtao.srp.user.dao.UserDao;
import live.yangtao.srp.user.domain.User;

import java.util.List;

/**
 * @author yangtao
 * @description 业务层
 * @create 2022-07-06 23:31
 */
public class UserManage {

    private UserDao userDao = new UserDao();

    public List<User> getAllUser() {
        // 其他业务操作
        return userDao.getAllUser();
    }

    public void insertUser(User user) {
        // 其他业务操作
        userDao.insertUser(user);
    }

}
