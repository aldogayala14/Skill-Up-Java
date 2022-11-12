package com.alkemy.wallet.service;


import com.alkemy.wallet.dto.basicDTO.UserBasicDTO;
import com.alkemy.wallet.model.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IUserService {
    /**
     * Delete an User using his/her Id number.
     * @param id
     * @throws Exception
     */
    public void delete(Long id) throws Exception;
    /**
     * Returns a List of all registered Users
     * @return List of Users
     */
    public List<UserEntity> getAll();

    public UserEntity findByEmail(String email);

    List<UserBasicDTO> getUsers();

    UserEntity findById(long userId) throws Exception;

    public Page<UserEntity> findAll(Pageable pageable) throws Exception;
}
