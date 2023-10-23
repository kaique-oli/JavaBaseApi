package br.com.JavaBaseApi.user;

import br.com.JavaBaseApi.model.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import lombok.Data;

@Data
@Entity(name = "tb_users")
public class UserModel extends BaseModel {
    @Column(unique = true)
    private String userName ;
    private String nome ;
    private String password ;
    private boolean deleted = false;
}
