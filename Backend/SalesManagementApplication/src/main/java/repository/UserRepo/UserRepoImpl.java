package repository.UserRepo;

import model.UserModel;

import java.util.List;

public class UserRepoImpl implements UserRepoInterface<UserModel,Long>{

    @Override
    public UserModel save(UserModel userEntity) {
        return null;
    }

    @Override
    public List<UserModel> saveAll(List<UserModel> userEntity) {
        return null;
    }

    @Override
    public void delete(UserModel userEntity) {

    }

    @Override
    public UserModel update(UserModel userEntity) {
        return null;
    }

    @Override
    public List<UserModel> findAll(Long userId) {
        return null;
    }

    @Override
    public List<UserModel> findById(Long userId) {
        return null;
    }
}
