package com.toma.pubgmc.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class Leavecmd extends CommandBase
{

	@Override
	public String getName()
	{
		return "leave";
	}

	@Override
	public String getUsage(ICommandSender sender)
	{
		return "Teleports you back to lobby.";
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException 
	{
		if(args.length == 0)
		{
			World world = sender.getEntityWorld();
			BlockPos sp = world.getSpawnPoint();
			Entity player = sender.getCommandSenderEntity();
			if(player instanceof EntityPlayer)
			{
				((EntityPlayer) player).attemptTeleport(sp.getX() + 0.5, sp.getY() + 1, sp.getZ() + 0.5);
				player.sendMessage(new TextComponentString(TextFormatting.GREEN + "You have been teleported back to lobby."));
			}
			
		}
	}
	
	@Override
	public int getRequiredPermissionLevel()
	{
		return 0;
	}
}
