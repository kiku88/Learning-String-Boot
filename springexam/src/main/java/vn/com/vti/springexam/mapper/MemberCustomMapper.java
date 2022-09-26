package vn.com.vti.springexam.mapper;


import java.util.List;

import vn.com.vti.springexam.entity.MemberCustom;

public interface MemberCustomMapper {
	List<MemberCustom> selectMemberByName(String memberName);
}
