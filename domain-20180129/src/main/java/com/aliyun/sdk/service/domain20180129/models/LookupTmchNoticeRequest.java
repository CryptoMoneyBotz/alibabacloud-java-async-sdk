// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LookupTmchNoticeRequest} extends {@link RequestModel}
 *
 * <p>LookupTmchNoticeRequest</p>
 */
public class LookupTmchNoticeRequest extends Request {
    @Query
    @NameInMap("ClaimKey")
    @Validation(required = true)
    private String claimKey;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private LookupTmchNoticeRequest(Builder builder) {
        super(builder);
        this.claimKey = builder.claimKey;
        this.lang = builder.lang;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LookupTmchNoticeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return claimKey
     */
    public String getClaimKey() {
        return this.claimKey;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<LookupTmchNoticeRequest, Builder> {
        private String claimKey; 
        private String lang; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(LookupTmchNoticeRequest response) {
            super(response);
            this.claimKey = response.claimKey;
            this.lang = response.lang;
            this.userClientIp = response.userClientIp;
        } 

        /**
         * ClaimKey.
         */
        public Builder claimKey(String claimKey) {
            this.putQueryParameter("ClaimKey", claimKey);
            this.claimKey = claimKey;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public LookupTmchNoticeRequest build() {
            return new LookupTmchNoticeRequest(this);
        } 

    } 

}
