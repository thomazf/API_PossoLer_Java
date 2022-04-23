package br.com.possoler.api.api_posso_ler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.possoler.api.api_posso_ler.entity.Site;

@Repository
public interface SiteRepository extends JpaRepository<Site, Integer>{
    
}