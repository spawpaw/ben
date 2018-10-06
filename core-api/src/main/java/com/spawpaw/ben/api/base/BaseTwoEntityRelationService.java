package com.spawpaw.ben.api.base;

import java.util.List;
import java.util.Set;

/**
 * 用于维护两个实体之间关系的基本service
 *
 * @param <ENTITY_MASTER> 主实体类型
 * @param <ID_MASTER>     主实体主键类型
 * @param <ENTITY_SLAVE>  从实体类型
 * @param <ID_SLAVE>      从实体主键类型
 * @author BenBenShang spawpaw@hotmail.com 2018.9-2018.9
 * @version 1.0
 */
public interface BaseTwoEntityRelationService<ENTITY_MASTER, ID_MASTER, ENTITY_SLAVE, ID_SLAVE> {

    //增

    /**
     * PostMapping: master/{masterId}/slave/{slaveId}
     *
     * @param masterId 主实体id
     * @param slaveId  从实体id
     */
    int createRelationBetween(ID_MASTER masterId, ID_SLAVE slaveId);

    /**
     * PostMapping: master/{masterId}/slave
     * data:[slaveId,slaveId2,...]
     *
     * @param masterId 主实体id
     * @param slaveIds 从实体id
     */
    int addSlavesToMaster(ID_MASTER masterId, List<ID_SLAVE> slaveIds);

    /**
     * PostMapping: slave/{slaveId}/master
     * data:[masterId,masterId2,...]
     *
     * @param slaveId   主实体id
     * @param masterIds 从实体id
     */
    int addMastersToSlave(ID_SLAVE slaveId, List<ID_MASTER> masterIds);

    //查

    /**
     * GetMapping: slave/{slaveId}/master
     *
     * @param slaveId 从实体id
     * @return [masterId, masterId2, ...]
     */
    Set<ENTITY_MASTER> findMasterEntityBySlaveEntityId(ID_SLAVE slaveId);

    /**
     * GetMapping: master/{masterId}/slave
     *
     * @param masterId 主实体id
     * @return [slaveId, slaveId2, ...]
     */
    Set<ENTITY_SLAVE> findSlaveEntityByMasterEntityId(ID_MASTER masterId);

    /**
     * GetMapping: slave/{slaveId}/master
     *
     * @param slaveId 从实体id
     * @return [masterId, masterId2, ...]
     */
    Set<ID_MASTER> findMasterEntityIdsBySlaveEntityId(ID_SLAVE slaveId);

    /**
     * GetMapping: master/{masterId}/slave
     *
     * @param masterId 主实体id
     * @return [slaveId, slaveId2, ...]
     */
    Set<ID_SLAVE> findSlaveEntityIdsByMasterEntityId(ID_MASTER masterId);

    //删

    /**
     * DeleteMapping: master/{masterId}/slave
     *
     * @param masterId 主实体id
     */
    int deleteRelationByMasterEntityId(ID_MASTER masterId);

    /**
     * DeleteMapping: slave/{slaveId}/master
     *
     * @param slaveId 从实体id
     * @return [masterId, masterId2, ...]
     */
    int deleteRelationBySlaveEntityId(ID_SLAVE slaveId);

    /**
     * DeleteMapping: master/{masterId}/slave/{slaveId}
     *
     * @param masterId 主实体id
     * @param slaveId  从实体id
     */
    int deleteRelationBetween(ID_MASTER masterId, ID_SLAVE slaveId);

}
