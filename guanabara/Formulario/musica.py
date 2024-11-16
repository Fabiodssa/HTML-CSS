import pygame
pygame.init()
pygame.mixer.music.load('audio.ogg')
pygame.mixer.music.play()
pygame.event.wait()