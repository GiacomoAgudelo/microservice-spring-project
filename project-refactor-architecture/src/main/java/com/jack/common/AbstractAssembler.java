package com.jack.common;

import java.util.Optional;

public interface AbstractAssembler<Input extends RequestDto, Output extends ResponseDto, Entity extends BaseEntity> {

    /**
     * Method assemble entity from request
     * @param request object that contain info to save in db
     */
    Optional<Entity> assembleEntity(final Input request);

    /**
     * Method that assemble response object from entity
     * @param entity
     * @return
     */
    Optional<Output> assembleResponse(final Entity entity);


    /**
     * Method that merge entity with input to update record
     * @param entity
     * @return
     */
    void merge(final Entity entity, final Input input);


}
