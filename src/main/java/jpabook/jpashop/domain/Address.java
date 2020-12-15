package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
public class Address {

    private String city;
    private String street;
    private String zipcode;

    // JPA ����� ��ƼƼ�� �Ӻ���� Ÿ���� �ڹ� �⺻�����ڸ� public/protected�� �����صξ�� �Ѵ�.
    // protected�� �δ� ���� �׳��� �����ϴ�.
    // JPA�� �̷� ������ �δ� ������ JPA ���� ���̺귯���� ��ü�� ������ �� ���÷��� ���� ����� ����� �� �ֵ��� �����ؾ� �ϱ� �����̴�.
    protected Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
