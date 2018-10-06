package com.spawpaw.ben.api.entity.upms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleHasPrivilegePK implements Serializable {
    private Long roleId;
    private Long privilegeId;
}
