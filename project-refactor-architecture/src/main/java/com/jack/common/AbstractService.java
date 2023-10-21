package com.jack.common;


import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Optional;

@Transactional
@RequiredArgsConstructor
public abstract class AbstractService<Entity extends BaseEntity, Input extends RequestDto, Output extends ResponseDto, ID> implements CrudService<Entity, Input, Output,  ID> {

    private final AbstractAssembler<Input, Output, Entity> assembler;

    private final JpaRepository<Entity, ID> repository;

    @Override
    public Output createRecord(final Input Input) throws Exception {
        Entity entity = assembler.assembleEntity(Input).orElseThrow(Exception::new);
        entity = Optional.ofNullable(repository.save(entity)).orElseThrow(Exception::new);
        return assembler.assembleResponse(entity).orElseThrow(Exception::new);
    }

    @Override
    public Output retriveRecord(final ID id){
        return null;
    }

    @Override
    public Collection<Output> retriveRecords(Collection<ID> ids){
        return null;
    }

    @Override
    public Output updateRecord(final Input input, final ID id){
        return null;
    }

    @Override
    public Collection<Output> updateRecords(final Collection<Entity> entity){
        return null;
    }
}
