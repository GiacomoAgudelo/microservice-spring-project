package com.jack.common;

import java.util.Collection;

public interface CrudService<Entity extends BaseEntity, Input extends RequestDto, Output extends ResponseDto, ID> {

    Output createRecord(final Input Input) throws Exception;
    Output retriveRecord(final ID id);
    Collection<Output> retriveRecords(Collection<ID> ids);
    Output updateRecord(final Input input, final ID id);
    Collection<Output> updateRecords(final Collection<Entity> entity);
}
