/*
 * Copyright 2013-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.poc.cassandra;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

/**
 * Sample user class.
 * 
 * @author Oliver Gierke
 * @author Thomas Darimont
 */

 
@Table(value = "poets")
public class Poet { 
 
 @PrimaryKey 
 private String id; 
 
 private String name; 
 private int age; 
 
 public Poet(String id, String name, int age) { 
  this.id = id; 
  this.name = name; 
  this.age = age; 
 } 
 
 public String getId() { 
  return id; 
 } 
 
 public String getName() { 
  return name; 
 } 
 
 public int getAge() { 
  return age; 
 } 
 
 @Override 
 public String toString() { 
  return "Person [id=" + id + ", name=" + name + ", age=" + age + "]"; 
 } 
 
}