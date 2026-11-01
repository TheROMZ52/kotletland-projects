# KotletLand Projects

A toolbox for the KotletLand universe — anti-cheat, server utilities, and fewer “who broke the server?” moments.

A collection of Minecraft server tools and development projects for the KotletLand network.

## Projects

### KotletLandAC

An evidence-driven anti-cheat plugin for Paper 1.21.x, built with Java 21. It correlates signals over time instead of issuing a punishment from a single threshold.

- Confidence-based evidence and cross-check correlation
- Movement and combat checks
- Optional GrimAC signal integration
- Optional SQLite/MySQL evidence storage
- Optional Velocity bridge for cross-server staff alerts
- Automatic punishment disabled by default

**Current documented version:** 1.2.0.

**Important:** the plugin has not yet been validated on a live server with real players. Treat detections as staff-review leads, not proof. See the full [KotletLandAC documentation](KotletLandAC/README.md).

### KotletClient

A PvP client mod for KotletLand on Minecraft 1.8.9 (Forge). HUD modules, keystrokes, target HUD, custom crosshair, smooth zoom, an in-game settings menu with themes, and an animated KotletLand main menu. Only legit modules, no cheats.

See the [KotletClient documentation](KotletClient/README.md).

## Repository structure

- `KotletLandAC/` — Paper anti-cheat plugin and Velocity alert module
- `KotletClient/` — Forge 1.8.9 PvP client mod

## Build

From the plugin directory:

```bash
cd KotletLandAC
gradle test build
```

Requirements: Java 21 and Paper 1.21.x for a server installation.

## Documentation

- [English](README.md)
- [فارسی](README.fa.md)
- [KotletLandAC technical documentation](KotletLandAC/README.md)
- [KotletLandAC — راهنمای فارسی](KotletLandAC/README.fa.md)
- [KotletClient documentation](KotletClient/README.md)
