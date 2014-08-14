/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eu.japtor.isman.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Honza
 */
public class Project {
    private Long id;
    private Date created;
    private Person createdBy;        
    private String header;
    private String desription;
    private List<Issue> issues;
}
