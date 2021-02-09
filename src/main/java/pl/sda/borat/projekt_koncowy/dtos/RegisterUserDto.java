package pl.sda.borat.projekt_koncowy.dtos;

import lombok.Getter;
import pl.sda.borat.projekt_koncowy.entity.UserEntity;

@Getter
public class RegisterUserDto {

    private final Long id;

    private final UserEntity userEntity;

    public RegisterUserDto(Long id, UserEntity userEntity) {
        this.id = id;
        this.userEntity = userEntity;
    }

    @Override
    public String toString() {
        return "RegisterUserDto{" +
                "userEntity=" + userEntity +
                '}';
    }
}
