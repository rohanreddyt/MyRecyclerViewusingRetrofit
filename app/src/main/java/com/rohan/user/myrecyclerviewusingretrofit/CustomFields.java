
package com.rohan.user.myrecyclerviewusingretrofit;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class CustomFields {

    @SerializedName("instant_articles_submission_id")
    @Expose
    private List<String> instantArticlesSubmissionId = new ArrayList<String>();
    @SerializedName("dsq_thread_id")
    @Expose
    private List<String> dsqThreadId = new ArrayList<String>();

    /**
     * 
     * @return
     *     The instantArticlesSubmissionId
     */
    public List<String> getInstantArticlesSubmissionId() {
        return instantArticlesSubmissionId;
    }

    /**
     * 
     * @param instantArticlesSubmissionId
     *     The instant_articles_submission_id
     */
    public void setInstantArticlesSubmissionId(List<String> instantArticlesSubmissionId) {
        this.instantArticlesSubmissionId = instantArticlesSubmissionId;
    }

    /**
     * 
     * @return
     *     The dsqThreadId
     */
    public List<String> getDsqThreadId() {
        return dsqThreadId;
    }

    /**
     * 
     * @param dsqThreadId
     *     The dsq_thread_id
     */
    public void setDsqThreadId(List<String> dsqThreadId) {
        this.dsqThreadId = dsqThreadId;
    }

}
