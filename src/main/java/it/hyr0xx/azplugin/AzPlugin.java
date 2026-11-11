package it.hyr0xx.azplugin;

import it.hyr0xx.azplugin.commands.AziendaCommand;
import it.hyr0xx.azplugin.commands.StaffAziendeCommand;
import it.hyr0xx.azplugin.listeners.InvitationGuiListener;
import it.hyr0xx.azplugin.service.CompanyService;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class AzPlugin extends JavaPlugin {

    private CompanyService companyService;
    private LuckPerms luckPerms;

    @Override
    public void onEnable() {
        saveDefaultConfig();

        if (Bukkit.getPluginManager().getPlugin("LuckPerms") == null) {
            getLogger().severe("Questo plugin richiede LuckPerms. Disabilitazione...");
            setEnabled(false);
            return;
        }

        this.luckPerms = LuckPermsProvider.get();
        this.companyService = new CompanyService(this);

        getCommand("staffaziende").setExecutor(new StaffAziendeCommand(this));
        getCommand("azienda").setExecutor(new AziendaCommand(this));
        Bukkit.getPluginManager().registerEvents(new InvitationGuiListener(this), this);

        getLogger().info("AziendePlugin attivato con supporto LuckPerms.");
    }

    @Override
    public void onDisable() {
        if (companyService != null) {
            companyService.save();
        }
    }

    public CompanyService getCompanyService() {
        return companyService;
    }

    public LuckPerms getLuckPerms() {
        return luckPerms;
    }
}
