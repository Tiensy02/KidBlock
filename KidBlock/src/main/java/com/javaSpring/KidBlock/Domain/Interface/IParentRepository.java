package com.javaSpring.KidBlock.Domain.Interface;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.javaSpring.KidBlock.Domain.Entity.AccountParent;

@Repository
public interface IParentRepository extends JpaRepository<AccountParent, UUID> {

    List<AccountParent> findAllByParentEmail(String parentEmail);

    AccountParent findByParentEmail(String parentEmail);
    
    AccountParent findByParentEmailAndParentPassword(String parentEmail, String parentPassword);

    // int findByParentEmail(
    //     @Param("parentEmail") String parentEmail,
    //     @Param("numberAcount") int numberAcount
    //     );

    /**
     * @decrition: hàm thực hiện kiểm tra tài khoản trong hệ thống, để cho phép đăng
     *             nhập
     * @param parentEmail        email của tài khoản
     * @param parentPassword     mật khẩu của tài khoản
     * @param accoutParentNumber số tài khoảng tìm được
     * @return số tài khoản tìm được: 1 - tìm được 1 tk => cho phép đăng nhập , != 1
     *         - lỗi
     */
    @Procedure(name = "Proc_Parent_Login")
    int parentLogin(
            @Param("parentEmail") String parentEmail,
            @Param("parentPassword") String parentPassword,
            @Param("accoutParentNumber") Integer accoutParentNumber);

    /**
     * @des: hàm thực hiện update dữ liệu tài khoản cha
     * @param parentEmail       email
     * @param parentPassword    mật khẩu cũ
     * @param newParentPassword mật khẩu mới
     * @param newParentName     tên mới
     * @param newParentAvatar   avatar mới
     * @param parentPIN         mã pin mới
     * @param updateStatus      trạng thái update: 1- thành công, != 1 thất bại
     * @return
     */
    @Procedure(name = "Proc_Parent_Update")
    int updateParent(
            @Param("parentEmail") String parentEmail,
            @Param("parentPassword") String parentPassword,
            @Param("newParentPassword") String newParentPassword,
            @Param("newParentName") String newParentName,
            @Param("newParentAvatar") String newParentAvatar,
            @Param("parentPIN") int parentPIN,
            @Param("updateStatus") int updateStatus);

}
