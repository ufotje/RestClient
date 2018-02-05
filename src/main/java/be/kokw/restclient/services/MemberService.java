package be.kokw.restclient.services;

import be.kokw.restclient.entities.Member;

public interface MemberService {
    Member addMember(Member member);
    Member findMemberByFirstNameAndLastName(String firstName, String lastName);
}
