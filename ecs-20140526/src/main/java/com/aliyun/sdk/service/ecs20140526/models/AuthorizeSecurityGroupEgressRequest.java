// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuthorizeSecurityGroupEgressRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeSecurityGroupEgressRequest</p>
 */
public class AuthorizeSecurityGroupEgressRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    private String securityGroupId;

    @Query
    @NameInMap("IpProtocol")
    @Validation(required = true)
    private String ipProtocol;

    @Query
    @NameInMap("PortRange")
    @Validation(required = true)
    private String portRange;

    @Query
    @NameInMap("DestGroupOwnerId")
    private Long destGroupOwnerId;

    @Query
    @NameInMap("DestGroupId")
    private String destGroupId;

    @Query
    @NameInMap("DestGroupOwnerAccount")
    private String destGroupOwnerAccount;

    @Query
    @NameInMap("DestCidrIp")
    private String destCidrIp;

    @Query
    @NameInMap("DestPrefixListId")
    private String destPrefixListId;

    @Query
    @NameInMap("SourceCidrIp")
    private String sourceCidrIp;

    @Query
    @NameInMap("Ipv6SourceCidrIp")
    private String ipv6SourceCidrIp;

    @Query
    @NameInMap("SourcePortRange")
    private String sourcePortRange;

    @Query
    @NameInMap("Policy")
    private String policy;

    @Query
    @NameInMap("NicType")
    private String nicType;

    @Query
    @NameInMap("Priority")
    private String priority;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Ipv6DestCidrIp")
    private String ipv6DestCidrIp;

    private AuthorizeSecurityGroupEgressRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.securityGroupId = builder.securityGroupId;
        this.ipProtocol = builder.ipProtocol;
        this.portRange = builder.portRange;
        this.destGroupOwnerId = builder.destGroupOwnerId;
        this.destGroupId = builder.destGroupId;
        this.destGroupOwnerAccount = builder.destGroupOwnerAccount;
        this.destCidrIp = builder.destCidrIp;
        this.destPrefixListId = builder.destPrefixListId;
        this.sourceCidrIp = builder.sourceCidrIp;
        this.ipv6SourceCidrIp = builder.ipv6SourceCidrIp;
        this.sourcePortRange = builder.sourcePortRange;
        this.policy = builder.policy;
        this.nicType = builder.nicType;
        this.priority = builder.priority;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.ipv6DestCidrIp = builder.ipv6DestCidrIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeSecurityGroupEgressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return ipProtocol
     */
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * @return portRange
     */
    public String getPortRange() {
        return this.portRange;
    }

    /**
     * @return destGroupOwnerId
     */
    public Long getDestGroupOwnerId() {
        return this.destGroupOwnerId;
    }

    /**
     * @return destGroupId
     */
    public String getDestGroupId() {
        return this.destGroupId;
    }

    /**
     * @return destGroupOwnerAccount
     */
    public String getDestGroupOwnerAccount() {
        return this.destGroupOwnerAccount;
    }

    /**
     * @return destCidrIp
     */
    public String getDestCidrIp() {
        return this.destCidrIp;
    }

    /**
     * @return destPrefixListId
     */
    public String getDestPrefixListId() {
        return this.destPrefixListId;
    }

    /**
     * @return sourceCidrIp
     */
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    /**
     * @return ipv6SourceCidrIp
     */
    public String getIpv6SourceCidrIp() {
        return this.ipv6SourceCidrIp;
    }

    /**
     * @return sourcePortRange
     */
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return nicType
     */
    public String getNicType() {
        return this.nicType;
    }

    /**
     * @return priority
     */
    public String getPriority() {
        return this.priority;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ipv6DestCidrIp
     */
    public String getIpv6DestCidrIp() {
        return this.ipv6DestCidrIp;
    }

    public static final class Builder extends Request.Builder<AuthorizeSecurityGroupEgressRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String regionId; 
        private String securityGroupId; 
        private String ipProtocol; 
        private String portRange; 
        private Long destGroupOwnerId; 
        private String destGroupId; 
        private String destGroupOwnerAccount; 
        private String destCidrIp; 
        private String destPrefixListId; 
        private String sourceCidrIp; 
        private String ipv6SourceCidrIp; 
        private String sourcePortRange; 
        private String policy; 
        private String nicType; 
        private String priority; 
        private String clientToken; 
        private String description; 
        private String ipv6DestCidrIp; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizeSecurityGroupEgressRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.regionId = request.regionId;
            this.securityGroupId = request.securityGroupId;
            this.ipProtocol = request.ipProtocol;
            this.portRange = request.portRange;
            this.destGroupOwnerId = request.destGroupOwnerId;
            this.destGroupId = request.destGroupId;
            this.destGroupOwnerAccount = request.destGroupOwnerAccount;
            this.destCidrIp = request.destCidrIp;
            this.destPrefixListId = request.destPrefixListId;
            this.sourceCidrIp = request.sourceCidrIp;
            this.ipv6SourceCidrIp = request.ipv6SourceCidrIp;
            this.sourcePortRange = request.sourcePortRange;
            this.policy = request.policy;
            this.nicType = request.nicType;
            this.priority = request.priority;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.ipv6DestCidrIp = request.ipv6DestCidrIp;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The region ID of the source security group. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the source security group.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * The transport layer protocol. The value is case sensitive. Valid values:
         * <p>
         * 
         * -icmp
         * -gre
         * -tcp
         * -udp
         * -all: all protocols are supported.
         */
        public Builder ipProtocol(String ipProtocol) {
            this.putQueryParameter("IpProtocol", ipProtocol);
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * The port range related to the transport layer protocol opened by the destination security group. Valid values:
         * <p>
         * 
         * -TCP/UDP: valid values: 1 to 65535. Use a slash (/) to separate the start port from the end port. Example: 1/200
         * -ICMP:-1/-1
         * -GRE protocol:-1/-1
         * -all:-1/-1
         */
        public Builder portRange(String portRange) {
            this.putQueryParameter("PortRange", portRange);
            this.portRange = portRange;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account to which the destination security group belongs.
         * <p>
         * 
         * -If neither "DestGroupOwnerId" nor "DestGroupOwnerAccount" is set, the access permission of other security groups is set.
         * -If you have set the "DestCidrIp" parameter, the "DestGroupOwnerId" parameter is invalid.
         */
        public Builder destGroupOwnerId(Long destGroupOwnerId) {
            this.putQueryParameter("DestGroupOwnerId", destGroupOwnerId);
            this.destGroupOwnerId = destGroupOwnerId;
            return this;
        }

        /**
         * The ID of the destination security group to which you want to configure access permissions. Set at least one of the "DestGroupId" or "DestCidrIp" parameters.
         * <p>
         * 
         * -If "DestGroupId" is specified but "DestCidrIp" is not specified, the value of "NicType" can only be intranet.
         * 
         * -If both "DestGroupId" and "DestCidrIp" are specified, the default value is "DestCidrIp.
         */
        public Builder destGroupId(String destGroupId) {
            this.putQueryParameter("DestGroupId", destGroupId);
            this.destGroupId = destGroupId;
            return this;
        }

        /**
         * The Alibaba Cloud account to which the destination security group belongs.
         * <p>
         * 
         * -If "DestGroupOwnerAccount" and "DestGroupOwnerId" are not set, the access permissions of other security groups are set.
         * -If the "DestCidrIp" parameter is set, the "DestGroupOwnerAccount" parameter is invalid.
         */
        public Builder destGroupOwnerAccount(String destGroupOwnerAccount) {
            this.putQueryParameter("DestGroupOwnerAccount", destGroupOwnerAccount);
            this.destGroupOwnerAccount = destGroupOwnerAccount;
            return this;
        }

        /**
         * The Destination IPv4 CIDR block to which you want to set access permissions. CIDR and IPv4 IP addresses are supported.
         * <p>
         * 
         * Default value: None
         */
        public Builder destCidrIp(String destCidrIp) {
            this.putQueryParameter("DestCidrIp", destCidrIp);
            this.destCidrIp = destCidrIp;
            return this;
        }

        /**
         * The list ID of the destination prefix to which you want to set access permissions. You can call [DescribePrefixLists](~~ 205046 ~~) to query the list IDs of available prefixes.
         * <p>
         * 
         * Note:
         * 
         * -If the network type of a security group is classic network, the prefix list cannot be set. For more information about security groups and Prefix List restrictions, see [Security Group restrictions](~~ 25412#SecurityGroupQuota1 ~~).
         * 
         * -If you specify one of the "DestCidrIp", "Ipv6DestCidrIp", or "DestGroupId" parameters, this parameter is ignored.
         */
        public Builder destPrefixListId(String destPrefixListId) {
            this.putQueryParameter("DestPrefixListId", destPrefixListId);
            this.destPrefixListId = destPrefixListId;
            return this;
        }

        /**
         * The range of source IP addresses. CIDR and IPv4 IP addresses are supported.
         * <p>
         * 
         * Default value: None
         */
        public Builder sourceCidrIp(String sourceCidrIp) {
            this.putQueryParameter("SourceCidrIp", sourceCidrIp);
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }

        /**
         * The source IPv6 CIDR block. CIDR and IPv6 IP addresses are supported.
         * <p>
         * 
         * > only VPC-type IP addresses are supported. This parameter cannot be set at the same time as the sourcecidrip" parameter.
         * 
         * Default value: None
         */
        public Builder ipv6SourceCidrIp(String ipv6SourceCidrIp) {
            this.putQueryParameter("Ipv6SourceCidrIp", ipv6SourceCidrIp);
            this.ipv6SourceCidrIp = ipv6SourceCidrIp;
            return this;
        }

        /**
         * The range of ports related to the transport layer protocol opened by the source security group. Valid values:
         * <p>
         * 
         * -TCP/UDP: 1 to 65535. Use a slash (/) to separate the start port from the end port. Example: 1/200
         * -ICMP:-1/-1
         * -GRE protocol:-1/-1
         * -all:-1/-1
         */
        public Builder sourcePortRange(String sourcePortRange) {
            this.putQueryParameter("SourcePortRange", sourcePortRange);
            this.sourcePortRange = sourcePortRange;
            return this;
        }

        /**
         * Set the access permission. Valid values:
         * <p>
         * 
         * -accept: accept access
         * -drop: Access Denied. No deny message is returned.
         * 
         * Default value: accept
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * The NIC type of the classic network security group rule. Valid values:
         * <p>
         * 
         * -internet: internet Nic
         * -intranet: intranet Nic
         * -You do not need to set the Nic type for VPC-type security group rules. The default value is intranet, which can only be intranet.
         * -When the security group is configured to access each other, that is, only the DestGroupId is specified, it can only be intranet.
         * 
         * Default value: internet
         */
        public Builder nicType(String nicType) {
            this.putQueryParameter("NicType", nicType);
            this.nicType = nicType;
            return this;
        }

        /**
         * The priority of the security group rule. Valid values: 1 to 100.
         * <p>
         * 
         * Default value: 1.
         */
        public Builder priority(String priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * Ensure the idempotence of the request. Generate a parameter value from your client. Make sure that the value is unique among different requests. **ClientToken** supports only ASCII characters and cannot exceed 64 characters. For more information, see [how to ensure idempotence](~~ 25693 ~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The description of the security group rule. The description must be 1 to 512 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The Destination IPv6 CIDR block to which you want to set access permissions. CIDR and IPv6 IP addresses are supported.
         * <p>
         * 
         * > only VPC-type IP addresses are supported. This parameter and the "DestCidrIp" parameter cannot be set at the same time.
         * 
         * 
         * Default value: None
         */
        public Builder ipv6DestCidrIp(String ipv6DestCidrIp) {
            this.putQueryParameter("Ipv6DestCidrIp", ipv6DestCidrIp);
            this.ipv6DestCidrIp = ipv6DestCidrIp;
            return this;
        }

        @Override
        public AuthorizeSecurityGroupEgressRequest build() {
            return new AuthorizeSecurityGroupEgressRequest(this);
        } 

    } 

}