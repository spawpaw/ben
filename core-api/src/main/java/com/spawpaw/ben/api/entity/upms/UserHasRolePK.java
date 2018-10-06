package com.spawpaw.ben.api.entity.upms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserHasRolePK implements Serializable {
    private Long userId;
    private Long roleId;
}
