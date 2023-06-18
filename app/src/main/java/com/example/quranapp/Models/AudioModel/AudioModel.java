package com.example.quranapp.Models.AudioModel;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class AudioModel{

	@SerializedName("audio_files")
	private List<AudioFilesItem> audioFiles;

	public List<AudioFilesItem> getAudioFiles(){
		return audioFiles;
	}

	@Override
 	public String toString(){
		return 
			"AudioModel{" + 
			"audio_files = '" + audioFiles + '\'' + 
			"}";
		}
}