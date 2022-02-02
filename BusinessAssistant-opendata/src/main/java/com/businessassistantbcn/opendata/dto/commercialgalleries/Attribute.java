package com.businessassistantbcn.opendata.dto.commercialgalleries;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Getter
@Setter
public class Attribute {
    public int id;
    public String name;
    public String description;
    public int category;
    public String type;
    public List<Option> options;
    public List<ValueDto> values;
}

