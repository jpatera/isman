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
public class Issue {
    private Long id;
    private Date created;
    private Person createdBy;
    private Person assignedTo;
    private String summary;
    private String description;
    private Integer priority;
    private IssStatus status;
    private List<Comment> comments;
    
}
