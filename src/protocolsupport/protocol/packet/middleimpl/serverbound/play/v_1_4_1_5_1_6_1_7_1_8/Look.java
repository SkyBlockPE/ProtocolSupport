package protocolsupport.protocol.packet.middleimpl.serverbound.play.v_1_4_1_5_1_6_1_7_1_8;

import java.io.IOException;

import protocolsupport.protocol.PacketDataSerializer;
import protocolsupport.protocol.packet.middle.serverbound.play.MiddleLook;

public class Look extends MiddleLook {

	@Override
	public void readFromClientData(PacketDataSerializer serializer) throws IOException {
		yaw = serializer.readFloat();
		pitch = serializer.readFloat();
		onGround = serializer.readBoolean();
	}

}