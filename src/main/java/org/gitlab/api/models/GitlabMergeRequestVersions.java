package org.gitlab.api.models;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GitlabMergeRequestVersions {
    public static final String URL = "/versions";

    private Integer id;
    @JsonProperty("head_commit_sha")
    private String headCommitSha;
    @JsonProperty("base_commit_sha")
    private String baseCommitSha	;
    @JsonProperty("start_commit_sha")
    private String startCommitSha;

    @JsonProperty("created_at")
    private Date createdAt;

    @JsonProperty("merge_request_id")
    private String mergeRequestId;
    
    private String state;
    
    @JsonProperty("real_size")
    private Integer realSize;
    
    @JsonProperty("commits")
    private List<GitlabMergeCommit> commits;
    
    @JsonProperty("diffs")
    private List<GitlabMergeDiff> diffs;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

	public String getHeadCommitSha() {
		return headCommitSha;
	}

	public void setHeadCommitSha(String headCommitSha) {
		this.headCommitSha = headCommitSha;
	}

	public String getBaseCommitSha() {
		return baseCommitSha;
	}

	public void setBaseCommitSha(String baseCommitSha) {
		this.baseCommitSha = baseCommitSha;
	}

	public String getStartCommitSha() {
		return startCommitSha;
	}

	public void setStartCommitSha(String startCommitSha) {
		this.startCommitSha = startCommitSha;
	}

	public String getMergeRequestId() {
		return mergeRequestId;
	}

	public void setMergeRequestId(String mergeRequestId) {
		this.mergeRequestId = mergeRequestId;
	}

	public Integer getRealSize() {
		return realSize;
	}

	public void setRealSize(Integer realSize) {
		this.realSize = realSize;
	}
    
    public List<GitlabMergeCommit> getCommits() {
        return commits;
    }

    public void setCommits(List<GitlabMergeCommit> commits) {
        this.commits = commits;
    }
    
    public List<GitlabMergeDiff> getDiffs() {
        return diffs;
    }

    public void setDiffs(List<GitlabMergeDiff> diffs) {
        this.diffs = diffs;
    }
    
}
