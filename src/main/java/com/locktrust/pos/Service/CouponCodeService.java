package com.locktrust.pos.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locktrust.pos.Dto.CouponCodeDto;
import com.locktrust.pos.Entity.CouponCode;
import com.locktrust.pos.Repository.CouponCodeRepository;
import com.locktrust.pos.Utils.Utils;

@Service
public class CouponCodeService {

	@Autowired
	private CouponCodeRepository repo;

	public CouponCode create(CouponCodeDto dto) {

		CouponCode entity = copyDtoToEntity(dto, null);

		repo.save(entity);

		return entity;

	}

	public CouponCode update(UUID uid, CouponCodeDto dto) {

		CouponCode entity = repo.findByUid(uid).orElse(null);

		entity = copyDtoToEntity(dto, entity);

		repo.save(entity);

		return entity;

	}

	public CouponCode retrive(UUID uid) {

		CouponCode entity = repo.findByUid(uid).orElse(null);

		if (!entity.equals(null)) {
			return null;
		}

		return entity;

	}

	public List<CouponCode> getAll() {
		return repo.findAll();
	}

	public void validateBeforeCreate(CouponCodeDto dto) {
		Map<String, String> error = new HashMap<String, String>();
		
		if (dto.getCouponCode().isEmpty() || dto.getCouponCode().equals(null)) {
			error.put("couponCode", "this field is coupon code");
		}
		if (Utils.CouponType.valueOf(null, null) != null) {
			error.put("couponCode", "this field is coupon code");
		}
	}

	public void delete(UUID uid) {

		CouponCode entity = repo.findByUid(uid).orElse(null);

		if (!entity.equals(null)) {
			repo.delete(entity);
		}
	}

	private CouponCode copyDtoToEntity(CouponCodeDto source, CouponCode target) {

		if (target == null) {
			target = new CouponCode();
		}

		BeanUtils.copyProperties(source, target);

		return target;
	}

	@SuppressWarnings("unused")
	private CouponCodeDto copyEntityToDto(CouponCode source, CouponCodeDto target) {

		if (target == null) {
			target = new CouponCodeDto();
		}

		BeanUtils.copyProperties(source, target);

		return target;

	}

}
