package com.businessassistantbcn.opendata.dto.commercialgalleries;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class SecondaryFilterDataDto {
	
    int id;
    String name;
    String full_path;
    int dependency_group;
    int parent_id;
    int tree_id;
    String asia_id;
    
}
