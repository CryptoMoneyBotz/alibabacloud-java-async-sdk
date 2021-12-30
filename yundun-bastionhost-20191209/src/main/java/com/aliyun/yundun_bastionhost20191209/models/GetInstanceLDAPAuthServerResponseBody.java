// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetInstanceLDAPAuthServerResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceLDAPAuthServerResponseBody</p>
 */
public class GetInstanceLDAPAuthServerResponseBody extends TeaModel {
    @NameInMap("LDAP")
    private LDAP LDAP;

    @NameInMap("RequestId")
    private String requestId;


    private GetInstanceLDAPAuthServerResponseBody(Builder builder) {
        this.LDAP = builder.LDAP;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceLDAPAuthServerResponseBody create() {
        return builder().build();
    }

    /**
     * @return LDAP
     */
    public LDAP getLDAP() {
        return this.LDAP;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LDAP LDAP; 
        private String requestId; 

        /**
         * <p>LDAP.</p>
         */
        public Builder LDAP(LDAP LDAP) {
            this.LDAP = LDAP;
            return this;
        }

        /**
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceLDAPAuthServerResponseBody build() {
            return new GetInstanceLDAPAuthServerResponseBody(this);
        } 

    } 

    public static class LDAP extends TeaModel {
        @NameInMap("Account")
        private String account;

        @NameInMap("BaseDN")
        private String baseDN;

        @NameInMap("EmailMapping")
        private String emailMapping;

        @NameInMap("Filter")
        private String filter;

        @NameInMap("HasPassword")
        private String hasPassword;

        @NameInMap("IsSSL")
        private Boolean isSSL;

        @NameInMap("LoginNameMapping")
        private String loginNameMapping;

        @NameInMap("MobileMapping")
        private String mobileMapping;

        @NameInMap("NameMapping")
        private String nameMapping;

        @NameInMap("Port")
        private Long port;

        @NameInMap("Server")
        private String server;

        @NameInMap("StandbyServer")
        private String standbyServer;


        private LDAP(Builder builder) {
            this.account = builder.account;
            this.baseDN = builder.baseDN;
            this.emailMapping = builder.emailMapping;
            this.filter = builder.filter;
            this.hasPassword = builder.hasPassword;
            this.isSSL = builder.isSSL;
            this.loginNameMapping = builder.loginNameMapping;
            this.mobileMapping = builder.mobileMapping;
            this.nameMapping = builder.nameMapping;
            this.port = builder.port;
            this.server = builder.server;
            this.standbyServer = builder.standbyServer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LDAP create() {
            return builder().build();
        }

        /**
         * @return account
         */
        public String getAccount() {
            return this.account;
        }

        /**
         * @return baseDN
         */
        public String getBaseDN() {
            return this.baseDN;
        }

        /**
         * @return emailMapping
         */
        public String getEmailMapping() {
            return this.emailMapping;
        }

        /**
         * @return filter
         */
        public String getFilter() {
            return this.filter;
        }

        /**
         * @return hasPassword
         */
        public String getHasPassword() {
            return this.hasPassword;
        }

        /**
         * @return isSSL
         */
        public Boolean getIsSSL() {
            return this.isSSL;
        }

        /**
         * @return loginNameMapping
         */
        public String getLoginNameMapping() {
            return this.loginNameMapping;
        }

        /**
         * @return mobileMapping
         */
        public String getMobileMapping() {
            return this.mobileMapping;
        }

        /**
         * @return nameMapping
         */
        public String getNameMapping() {
            return this.nameMapping;
        }

        /**
         * @return port
         */
        public Long getPort() {
            return this.port;
        }

        /**
         * @return server
         */
        public String getServer() {
            return this.server;
        }

        /**
         * @return standbyServer
         */
        public String getStandbyServer() {
            return this.standbyServer;
        }

        public static final class Builder {
            private String account; 
            private String baseDN; 
            private String emailMapping; 
            private String filter; 
            private String hasPassword; 
            private Boolean isSSL; 
            private String loginNameMapping; 
            private String mobileMapping; 
            private String nameMapping; 
            private Long port; 
            private String server; 
            private String standbyServer; 

            /**
             * <p>Account.</p>
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * <p>BaseDN.</p>
             */
            public Builder baseDN(String baseDN) {
                this.baseDN = baseDN;
                return this;
            }

            /**
             * <p>EmailMapping.</p>
             */
            public Builder emailMapping(String emailMapping) {
                this.emailMapping = emailMapping;
                return this;
            }

            /**
             * <p>Filter.</p>
             */
            public Builder filter(String filter) {
                this.filter = filter;
                return this;
            }

            /**
             * <p>HasPassword.</p>
             */
            public Builder hasPassword(String hasPassword) {
                this.hasPassword = hasPassword;
                return this;
            }

            /**
             * <p>IsSSL.</p>
             */
            public Builder isSSL(Boolean isSSL) {
                this.isSSL = isSSL;
                return this;
            }

            /**
             * <p>LoginNameMapping.</p>
             */
            public Builder loginNameMapping(String loginNameMapping) {
                this.loginNameMapping = loginNameMapping;
                return this;
            }

            /**
             * <p>MobileMapping.</p>
             */
            public Builder mobileMapping(String mobileMapping) {
                this.mobileMapping = mobileMapping;
                return this;
            }

            /**
             * <p>NameMapping.</p>
             */
            public Builder nameMapping(String nameMapping) {
                this.nameMapping = nameMapping;
                return this;
            }

            /**
             * <p>Port.</p>
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * <p>Server.</p>
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            /**
             * <p>StandbyServer.</p>
             */
            public Builder standbyServer(String standbyServer) {
                this.standbyServer = standbyServer;
                return this;
            }

            public LDAP build() {
                return new LDAP(this);
            } 

        } 

    }
}
