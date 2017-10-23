package com.airlenet.play.main.service;

import com.airlenet.play.main.entity.AuthorityEntity;
import com.airlenet.play.main.entity.QAuthorityEntity;
import com.airlenet.play.main.repo.AuthorityEntityRespository;
import com.airlenet.play.main.repo.RoleEntityRepository;
import com.airlenet.repo.jpa.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorityEntityService extends
		EntityService<AuthorityEntity, Long> {

	@Autowired
	private AuthorityEntityRespository authorityEntityRespository;

	@Autowired
	private RoleEntityRepository roleEntityRespository;

	public Iterable<AuthorityEntity> findAuthoritiesByMenuId(Long menuId) {
		return authorityEntityRespository
				.findAll(QAuthorityEntity.authorityEntity.menu.id.eq(menuId));
	}

	public Iterable<AuthorityEntity> findAuthoritiesByMenuIdAndType(
			Long menuId, AuthorityEntity.PermissionType type) {
		return authorityEntityRespository
				.findAll(QAuthorityEntity.authorityEntity.menu.id.eq(menuId)
						.and(QAuthorityEntity.authorityEntity.type.eq(type)));
	}

	public List<AuthorityEntity> findAuthoritiesByRoleId(Long roleId) {
		return roleEntityRespository.findOne(roleId).getAuthorities();
	}

}
