package com.example.project.notices.domain;

import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
@Entity
@Table(name = "notice")
public class Notices {

  @Id
  @GeneratedValue
  private Long id;

  @Column(name = "title")
  private String title;

  @Column(name = "rdate")
  @CreatedDate
  private LocalDateTime rdate;

  @Column(name = "mdate")
  @LastModifiedDate
  private LocalDateTime mdate;

  @Builder
  public Notices(Long id, String title, LocalDateTime rdate, LocalDateTime mdate) {
    this.id = id;
    this.title = title;
    this.rdate = rdate;
    this.mdate = mdate;
  }


}
