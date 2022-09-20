package net.corda.v5.membership

import net.corda.v5.base.annotations.CordaSerializable
import net.corda.v5.base.types.LayeredPropertyMap
import net.corda.v5.base.types.MemberX500Name

/**
 * Stores information about a notary service available in the network.
 */
@CordaSerializable
interface NotaryInfo : LayeredPropertyMap {
    /**
     * Identity of the notary (note that it can be an identity of the distributed node).
     *
     */
    val party: MemberX500Name

    /**
     * The type of notary plugin class used for this notary.
     */
    val pluginClass: String
}