package fr.utbm.da50.configurationrepositorymanager.entity;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Node("Configuration")
public class Configuration {
	@Id @GeneratedValue
	private Long id;
	@Property("nom")
	private String nom;
	
	@Relationship(type = "CONTENIR", direction = Direction.OUTGOING)
	private Set<Objet> objets = new HashSet<>();
	
}
